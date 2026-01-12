package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("Test 2");
        Department department = new Department(2, null);
        List<Department> departments = departmentDao.findByDepartment(department);
        for (Department d : departments){
            System.out.println(d);
        }

        sc.close();

    }
}
