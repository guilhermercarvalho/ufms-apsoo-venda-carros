package br.ufms.apsoo.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import br.ufms.apsoo.model.Carro;
import br.ufms.apsoo.model.Cliente;
import br.ufms.apsoo.model.Funcionario;
import br.ufms.apsoo.model.Orcamento;

public class ComprovantePdf {

  private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD);
  private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);
  private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
  private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
  private static Font smallTable = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);

  // iText allows to add metadata to the PDF which can be viewed in your Adobe
  // Reader
  // under File -> Properties
  private static void addMetaData(Document document) {
    document.addTitle("ComprovanteVenda-ID");
    document.addSubject("Comprovante de venda realizada pela concessionaria Carronix.");
    document.addAuthor("FUNCIONARIO");
    document.addCreator("Carronix");
    document.addCreationDate();
  }

  private static void addTitlePage(Document document) throws DocumentException, IOException {
    Paragraph preface = new Paragraph();

    preface.add(new Paragraph("Carronix", catFont));
    preface.add(new Paragraph("Comprovante de Venda - ID", catFont));

    Image image = Image.getInstance("/workspace/resources/carronix.jpg");
    image.scalePercent(5);

    addEmptyLine(preface, 1);

    Locale local = new Locale("pt", "BR");
    DateFormat df = new SimpleDateFormat("EEEE, dd/MM/yyyy", local);
    DateFormat dftime = new SimpleDateFormat("HH:mm:ss", local);

    preface.add(new Paragraph("Comprovante gerado por: " + System.getProperty("user.name"), smallBold));
    preface.add(new Paragraph("Data: " + df.format(new Date()) + " às " + dftime.format(new Date()), smallBold));

    addEmptyLine(preface, 1);

    document.add(image);
    document.add(preface);
  }

  private static void text1(Document document, Orcamento v, Funcionario f, Cliente c) throws DocumentException {
    Paragraph paragraph = new Paragraph();

    String text = String.format(
        "Eu, %s, vendedor abaixo assinado, pela quantia de R$%.2f, vendo ao abaixo assinado comprador %s, o(s) seguinte(s) item(ns):",
        f.getNome(), v.getValorTotal(), c.getNome());
    paragraph.add(new Paragraph(text));

    addEmptyLine(paragraph, 1);

    document.add(paragraph);
  }

  private static void text2(Document document) throws DocumentException {
    Paragraph paragraph = new Paragraph();

    String t1 = "O vendedor afirma que a informação acima sobre o(s) item(ns) vendido(s) é verdadeira e precisa, de acordo com todo seu conhecimento.";
    String t2 = "O comprador aceita receber este Recibo de Venda e entende que o(s) item(ns) acima está(ão) sendo vendido(s) na condição \"como está\" e não acompanha nenhuma garantia de qualquer natureza.";

    paragraph.add(t1);
    addEmptyLine(paragraph, 1);
    paragraph.add(t2);

    addEmptyLine(paragraph, 1);
    document.add(paragraph);
  }

  private static void textCarro(Document document, Carro c) throws DocumentException {
    Paragraph paragraph = new Paragraph();

    paragraph.add(new Paragraph("Carro", subFont));

    paragraph.add(new Paragraph("Marca: " + c.getMarca()));
    paragraph.add(new Paragraph("Modelo: " + c.getMarca()));
    paragraph.add(new Paragraph("Código: " + c.getCodigo()));
    paragraph.add(new Paragraph("Ano: " + c.getAno()));
    paragraph.add(new Paragraph("Cor: " + c.getCor()));

    addEmptyLine(paragraph, 1);
    document.add(paragraph);
  }

  private static Paragraph textCliente() throws DocumentException {
    Paragraph paragraph = new Paragraph();

    paragraph.add(new Paragraph("Cliente", subFont));

    paragraph.add(new Paragraph("Nome: "));
    paragraph.add(new Paragraph("CPF: "));
    paragraph.add(new Paragraph("Endereço: "));
    paragraph.add(new Paragraph("Cidade: "));
    paragraph.add(new Paragraph("Estado: "));
    paragraph.add(new Paragraph("CEP: "));
    paragraph.add(new Paragraph("FONE: "));

    addEmptyLine(paragraph, 1);
    return paragraph;
  }

  private static Paragraph textVendedor() {
    Paragraph paragraph = new Paragraph();

    paragraph.add(new Paragraph("Vendedor", subFont));

    paragraph.add(new Paragraph("Nome: "));
    paragraph.add(new Paragraph("CPF: "));
    paragraph.add(new Paragraph("Endereço: "));
    paragraph.add(new Paragraph("Cidade: "));
    paragraph.add(new Paragraph("Estado: "));
    paragraph.add(new Paragraph("CEP: "));
    paragraph.add(new Paragraph("FONE: "));

    addEmptyLine(paragraph, 1);
    return paragraph;
  }

  private static void textVenda(Document document, Orcamento v) throws DocumentException {
    Paragraph paragraph = new Paragraph();

    document.add(new Paragraph("Informações da Venda"));
    addEmptyLine(paragraph, 1);
    document.add(paragraph);

    createTableSummary(document, v);

    addEmptyLine(paragraph, 1);
    document.add(paragraph);
  }

  private static void createTableSummary(Document document, Orcamento v) throws BadElementException, DocumentException {
    PdfPTable table = new PdfPTable(8);

    table.setWidthPercentage(100);

    PdfPCell c1 = new PdfPCell(new Phrase("venda"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("data"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("funcionario"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("cliente"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("carro"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("nº parcelas"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("val entrada"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("val total"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);
    table.setHeaderRows(1);

    table.addCell(String.format("%d", v.getId()));
    table.addCell(String.format("%s", v.getData()));
    table.addCell(String.format("%d", v.getFuncionario().getCodigo()));
    table.addCell(String.format("%d", v.getCliente().getCodigo()));
    table.addCell(String.format("%d", v.getCarro().getCodigo()));
    table.addCell(String.format("%d", v.getNumParcelas()));
    table.addCell(String.format("R$%.2f", v.getValorEntrada()));
    table.addCell(String.format("R$%.2f", v.getValorTotal()));

    document.add(table);
  }

  private static void textFuncCli(Document document, Funcionario f, Cliente c) throws DocumentException {
    Paragraph paragraph = new Paragraph();

    PdfPTable table = new PdfPTable(2);
    table.setWidthPercentage(100);

    PdfPCell c1 = new PdfPCell(new Phrase("Vendedor", smallBold));
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Cliente", smallBold));
    table.addCell(c1);

    table.addCell("Nome: " + f.getNome());
    table.addCell("Nome: " + c.getNome());
    table.addCell("CPF: " + f.getCpf());
    table.addCell("CPF: " + c.getCpf());
    table.addCell("Endereço: " + f.getEndereco().getRua() + ", " + f.getEndereco().getNumero() + " - "
        + f.getEndereco().getBairro());
    table.addCell("Endereço: " + c.getEndereco().getRua() + ", " + c.getEndereco().getNumero() + " - "
        + c.getEndereco().getBairro());
    table.addCell("Cidade: " + f.getEndereco().getCidade());
    table.addCell("Cidade: " + c.getEndereco().getCidade());
    table.addCell("Estado: " + f.getEndereco().getEstado());
    table.addCell("Estado: " + c.getEndereco().getEstado());
    table.addCell("CEP: " + f.getEndereco().getCep());
    table.addCell("CEP: " + c.getEndereco().getCep());
    table.addCell("FONE: " + f.getTelCelular());
    table.addCell("FONE: " + c.getTelCelular());

    addEmptyLine(paragraph, 1);

    document.add(table);
    document.add(paragraph);
  }

  private static void addContent(Document document, Orcamento venda, Funcionario funcionario, Cliente cliente, Carro carro)
      throws DocumentException {
    text1(document, venda, funcionario, cliente);
    textCarro(document, carro);
    text2(document);
    textFuncCli(document, funcionario, cliente);
    textVenda(document, venda);
  }

  private static void addEmptyLine(Paragraph paragraph, int number) {
    for (int i = 0; i < number; i++) {
      paragraph.add(new Paragraph(" "));
    }
  }

  public static void generate(Orcamento venda, Funcionario funcionario, Cliente cliente, Carro carro) {
    Document document = new Document();
    String path = "/workspace/comprovantes/";
    String name = "venda-" + venda.getId();
    try {
      PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(path + name));
      document.open();
      addMetaData(document);
      addTitlePage(document);
      addContent(document, venda, funcionario, cliente, carro);
      document.close();
      writer.close();
    } catch (DocumentException e) {
      e.printStackTrace();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
