package proxy.downlaod_sis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class CountryServiceLogger implements ICountryService {

    private ArrayList<String> countryList;
    private ICountryService iCountryService;
    private Logger logger;

    public CountryServiceLogger(ICountryService iCountryService, ArrayList<String> countryList) {
        this.iCountryService = iCountryService;
        this.countryList = countryList;
        logger = LoggerFactory.getLogger(CountryServiceLogger.class);
    }

    @Override
    public boolean downloadFile(String country) {
        logger.info("Before download");
        if (!this.countryList.contains(country)) return false;
        boolean result = iCountryService.downloadFile(country);
        String message = result? "Downloaded" : "Failed";
        logger.info(message);
        return false;
    }
}
