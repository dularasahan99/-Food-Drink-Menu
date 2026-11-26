package aiwa.controller;

import java.util.ArrayList;
import java.util.Scanner;

import aiwa.entity.Drink;
import aiwa.model.DrinkModel;
import aiwa.view.DrinkView;

public class DrinkController {

	public void showMenu() {

		Scanner scanInt = new Scanner(System.in);

		DrinkModel dm = new DrinkModel();
		DrinkView dv = new DrinkView();

		System.out.println("🍺🍺🍺🍺🍺🍺🍺🍺🍺🍺🍺🍺");
		System.out.println("****スリランカ飲み物メニュー***:");
		System.out.println("🍺🍺🍺🍺🍺🍺🍺🍺🍺🍺🍺🍺");

		while (true) {
			System.out.println(("1:ソフトドリンク 2:お酒 3:終了"));

			int menu = scanInt.nextInt();

			if (menu == 1) {
				ArrayList<Drink> drinks = dm.findByType(menu);
				dv.showlist(drinks);

			} else if (menu == 2) {

				System.out.println("キーワードを入力してください");
				String word = scanInt.nextLine();

				ArrayList<Drink> drinks = dm.findByType(1);
				dv.showlist(drinks);
			}
		}
	}
}
