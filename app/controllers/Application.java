package controllers;

import models.Company;
import play.data.validation.Valid;
import play.mvc.Controller;

import java.util.List;

public class Application extends Controller {

    public static void listCompanies() {
        List<Company> companies = Company.list();
        render(companies);
    }

    public static void createCompany() {
        render();
    }

    public static void showCompany(Long id) {
        Company company = Company.findById(id);
        render(company);
    }

    public static void saveCompany(@Valid Company company) {
        if (!validation.valid(company).ok) {
            params.flash();
            validation.keep();
            createCompany();
        }
        Long id = (Long) company.save()._key();
        listCompanies();
    }


}