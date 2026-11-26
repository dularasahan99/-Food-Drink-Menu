package aiwa.view;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import aiwa.entity.Drink;

public class DrinkView {

	public void showlist(ArrayList<Drink> drinks) {
		try {
			FileWriter fw = new FileWriter("menu.html");

			fw.write("<link rel='stylesheet' href='style.css'>");

			fw.write("<h1>飲み物メニュー</h1>");
			fw.write("<table border='1'>");

			fw.write("<tr>");
			fw.write("<th>画像</th>");
			fw.write("<th>飲み物名</th>");
			fw.write("<th>価格</th>");
			fw.write("</tr>");

			for (Drink d : drinks) {

				fw.write("<tr>");
				fw.write("<td>");
				fw.write("<a href='details/" + d.getDrinkId() + ".html'>");
				fw.write("<img height='100px' src='" + d.getImage() + "'>");
				fw.write("</a>");
				fw.write("</td>");
				fw.write("<td>" + d.getDrinkName() + "</td>");
				fw.write("<td>" + d.getPrice() + "円</td>");
				fw.write("</tr>");

				showDetail(d);

			}
			fw.write("</table>");
			fw.close();

			File file = new File("menu.html");
			Desktop.getDesktop().browse(file.toURI());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showDetail(Drink drink) {

		try {

			FileWriter fw = new FileWriter("details/" + drink.getDrinkId() + ".html");
			fw.write("<h1>飲み物詳細</h1>");
			fw.write("<table border='1'>");

			fw.write("<tr>");
			fw.write("<th>商品ID</th>");
			fw.write("<td>" + drink.getDrinkId() + "</td>");
			fw.write("</tr>");

			fw.write("<tr>");
			fw.write("<th>商品名</th>");
			fw.write("<td>" + drink.getDrinkName() + "</td>");
			fw.write("</tr>");

			fw.write("<tr>");
			fw.write("<th>価格</th>");
			fw.write("<td>" + drink.getPrice() + "</td>");
			fw.write("</tr>");

			fw.write("<tr>");
			fw.write("<th>種類</th>");
			fw.write("<td>" + drink.getType() + "</td>");
			fw.write("</tr>");

			fw.write("<tr>");
			fw.write("<th>画像</th>");
			fw.write("<td><img height='300px' src='" + drink.getImage() + "'></td>");
			fw.write("</tr>");

			fw.write("</table>");

			fw.write("<a href='#' onclick='history.back()'>戻る</a>");

			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
