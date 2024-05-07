
import org.example.Company;
import org.example.CompanyUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyUtilTest {

    private CompanyUtil companyUtil = new CompanyUtil();
    private Company testCompany= new Company("Test Company", "123 Test St", "Test Country", "Test City");

    @Test
    public void testGetCompanyLocation() {
        String expected = "Test City, Test Country";
        String actual = companyUtil.getCompanyLocation(testCompany);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCompanyInfo() {
        String expected = "Test Company located in Test City, Test Country";
        String actual = companyUtil.getCompanyInfo(testCompany);
        assertEquals(expected, actual);
    }

    @Test
    public void testCreateCompany() {
        Company actual = companyUtil.createCompany("New Company", "456 New St", "New Country", "New City");
        assertEquals("New Company", actual.getName());
        assertEquals("456 New St", actual.getAddress());
        assertEquals("New Country", actual.getCountry());
        assertEquals("New City", actual.getCity());
    }
}