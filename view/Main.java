package view;

import model.GeoLiteCity;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opencsv.CSVReader;

public class Main {
	private static SessionFactory factory;

	public static void main(String[] args) {
		System.out.println(readCsvFile().get(123810));

		//setUpFactory();
		Main m = new Main();

	}

	private static List<GeoLiteCity> readCsvFile() {
		try {
			ArrayList<GeoLiteCity> cities = new ArrayList<GeoLiteCity>();
			File csvFile = new File("C:\\Users\\Asad\\workspace\\Lab5\\src\\main\\GeoLiteCity-Location.csv");
			CSVReader reader = new CSVReader(new FileReader(csvFile));
			String[] nextLine;

			while ((nextLine = reader.readNext()) != null) {
				try{
				cities.add(new GeoLiteCity(Integer.parseInt(nextLine[0].trim()),
						nextLine[1],
						nextLine[2],
						nextLine[3],
						nextLine[4],
						parsefloat(nextLine[5]),
						parsefloat(nextLine[6]),
						parseint(nextLine[7]),
						parseint(nextLine[8])));
				}
				catch(Exception e){e.printStackTrace();}
			}
			return cities;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	static  private int parseint(String s){
		if(s!=null && !s.isEmpty()){
			return Integer.parseInt(s);
		}
		else
			return (Integer) null;
	}
	static  private float parsefloat(String s){
		if(s!=null && !s.isEmpty()){
			return Float.parseFloat(s);
		}
		else
			return (Float) null;
	}
	private static void setUpFactory() {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
	}

	private void listActors() {
		Session ss = factory.openSession();
		Transaction tx = null;
		try {
			tx = ss.beginTransaction();
			List<GeoLiteCity> cities = ss.createQuery("FROM Actor").list();
			for (GeoLiteCity city : cities) {
				System.out.println(city + "");
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ss.close();
		}
	}
}