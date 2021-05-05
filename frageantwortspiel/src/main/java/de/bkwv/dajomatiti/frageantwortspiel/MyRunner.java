//package de.bkwv.dajomatiti.frageantwortspiel;
//
//import de.bkwv.dajomatiti.frageantwortspiel.domain.Fach;
//import de.bkwv.dajomatiti.frageantwortspiel.domain.Thema;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Scanner;
//
//@Component
//public class MyRunner implements CommandLineRunner {
//
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println(themaRepository.findById("Deutsch").get().toString());
//        System.out.println("Enter word!");
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        System.out.println(line);
//
//
//        //Thema toast = new Thema();
//        //toast.setPK_THEMA("Toast");
//        //themaRepository.findById("Deutsch").get().getThemenliste().add(toast);
//        //Fach result = themaRepository.findById("Deutsch").get();
//        //result.getThemenliste().add(toast);
//        //themaRepository.save(result);
//
//    }
//
//    @Autowired
//    FachRepository themaRepository;
//}