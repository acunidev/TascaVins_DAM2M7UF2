package com.somelier.web;

import com.somelier.model.ViExpert;
import com.somelier.model.Vins;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ViSelectionAction", value = "/ViSelectionAction")
public class ViSelectionAction extends HttpServlet {

  /**
   * M'és necessari si no em salta un error alhora distanciar el ViSelectionAction
   */
  public ViSelectionAction() {
    // TODO document why this constructor is empty
  }

  /**
   * Afegeix tots els vins la llista de vins.
   *
   * @param viExpert
   */
  private void addVins(ViExpert viExpert) {
//    Vins Rosats
    for (int index = 0; index < VinsUtils.VINS_ROSATS.length; index++) {
      viExpert.addVins(new Vins(VinsUtils.VINS_ROSATS[index], VinsUtils.ROSAT,
                                VinsUtils.VINS_ROSATS_PATH_IMG[index]));
    }

//    Vins Blancs
    for (int index = 0; index < VinsUtils.VINS_BLANCS.length; index++) {
      viExpert.addVins(new Vins(VinsUtils.VINS_BLANCS[index], VinsUtils.BLANC,
                                VinsUtils.VINS_BLANCS_PATH_IMG[index]));
    }

//    Vins Negres
    for (int index = 0; index < VinsUtils.VINS_NEGRES.length; index++) {
      viExpert.addVins(new Vins(VinsUtils.VINS_NEGRES[index], VinsUtils.NEGRE,
                                VinsUtils.VINS_NEGRES_PATH_IMG[index]));
    }
  }

  /**
   * @param tipusVi
   * @param viExpert
   * @param printWriter
   */
  private void printTable(String tipusVi, ViExpert viExpert, PrintWriter printWriter) {
    printWriter.println("<table>");
    final List<Vins> marques = viExpert.getVinsByType(tipusVi);
    printWriter.println("<tr>");
    for (Vins vi : marques) {
      final boolean isSameType = vi.getTipus().equals(tipusVi);
      if (isSameType) {
        printWriter.printf("<td class='imgVins'><img src='%s' alt='%s'><p>%s</p></td>",
                           vi.getImgPath(), vi.getNom(), vi.getNom())
            .println();
      }
    }
    printWriter.println("</tr>");
    printWriter.println("</table>");
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {/* TODO document why this method is empty */}

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String tipusVi = request.getParameter("color");
    ViExpert viExpert = new ViExpert();
    addVins(viExpert);/*    HTML */
    response.setContentType("text/html");
    try (PrintWriter printWriter = response.getWriter()) {
      printWriter.println("<head>");
      printWriter.println("<link href='sugesVins.css' rel='stylesheet'>");
      printWriter.println("<title>Marques de Vi " + tipusVi + " suggerides</title>");
      printWriter.println("</head>");
      printWriter.println("<body>");
      printWriter.println("<div class='contenedor'>");
      printWriter.println("<H1>Marques de Vi " + tipusVi + " suggerides</H1>");
      printTable(tipusVi, viExpert, printWriter);
      printWriter.println("</div>");
      printWriter.println("");
      printWriter.println("</body>");
      printWriter.println("</html>");
    }
  }
}
