package com.bilgeadam.week05.lesson04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		//sayılar adında Integer tipinde bir Liste oluşturulacak
		//İçerisine 2 basamaklı sayılar eklenecek (5-6 sayı)
		
		List<Integer> besIleBolunenList = new ArrayList<Integer>();
		
		besIleBolunenList.add(25);
		besIleBolunenList.add(50);
		besIleBolunenList.add(23);
		besIleBolunenList.add(87);
		besIleBolunenList.add(98);
		
		//listede 5 ile bölünen sayılar alınıp yeni bir listeye eklenecek ve liste yazdırılacak (Streamle çöz) (filter)
		List<Integer> filteredList = besIleBolunenList.stream().filter(number -> number % 5 == 0).toList();
		System.out.println(filteredList);
		filteredList.forEach(number -> System.out.println(number));

		//listede 5 ile bölünen kaç sayı var'a bakılacak(filter)
		System.out.println(besIleBolunenList.stream().filter(number -> number % 5 == 0).count());
		//listedeki sayıların kendisi ile çarpımları bir listeye eklenecek ve yazdırılacak.(foreach)
		//collect --> ile topluyorduk.
		
		
		List<Integer> carpim1 = new ArrayList<>();
		besIleBolunenList.stream().forEach(number -> carpim1.add(number*number));
		System.out.println(carpim1);
		
		List<Integer> carpim2 = besIleBolunenList.stream().map(number -> number*number).collect(Collectors.toList());
		System.out.println(carpim2);
		
		
	}

}
