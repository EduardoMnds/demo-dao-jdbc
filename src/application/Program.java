package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("Test 2");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        for (Seller s : sellers){
            System.out.println(s);
        }
        System.out.println("Test 3");
        sellers = sellerDao.findAll();
        for (Seller s : sellers){
            System.out.println(s);
        }
        System.out.println("Test 4");

        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0,
                department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New Id: " + newSeller.getId());

        System.out.println("Test 5");
        newSeller = sellerDao.findById(1);
        newSeller.setName("Juan");
        sellerDao.update(newSeller);
        System.out.println("Updated! Id: " + newSeller.getId());

        System.out.println("Test 6");
        System.out.println("Enter Id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Deleted! Id: " + id);

        sc.close();
    }
}
