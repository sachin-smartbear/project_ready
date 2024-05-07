package org.example;

public class CompanyUtil {

    public String getCompanyLocation(Company company) {
        return company.getCity() + ", " + company.getCountry();
    }

    public String getCompanyInfo(Company company) {
        return company.getName() + " located in " + company.getCity() + ", " + company.getCountry();
    }

    public Company createCompany(String name, String address, String country, String city) {
        return new Company(name, address, country, city);
    }

}
