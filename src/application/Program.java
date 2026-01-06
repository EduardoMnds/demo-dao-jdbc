package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args){

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("Test 2");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        for (Seller s : sellers){
            System.out.println(s);
        }
        System.out.println("Test 23");
        sellers = sellerDao.findAll();
        for (Seller s : sellers){
            System.out.println(s);
        }
        System.out.println("Test 23");

        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0,
                department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New Id: " + newSeller.getId());
    }
}
