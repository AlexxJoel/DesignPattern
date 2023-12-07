package proxy.downlaod_sis;

public class CountryService implements ICountryService {


    public CountryService() {}

    @Override
    public boolean downloadFile(String country) {
        System.out.println("Begin the downloaded" + country);
        return true;
    }
}
