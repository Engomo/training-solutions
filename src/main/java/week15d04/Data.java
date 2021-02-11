package week15d04;

public class Data implements Comparable<Data>{
    private String dateRep;
    private String year_week;
    private String cases_weekly;
    private String deaths_weekly;
    private String countriesAndTerritories;

    public Data(String dateRep, String year_week, String cases_weekly, String deaths_weekly, String countriesAndTerritories) {
        this.dateRep = dateRep;
        this.year_week = year_week;
        this.cases_weekly = cases_weekly;
        this.deaths_weekly = deaths_weekly;
        this.countriesAndTerritories = countriesAndTerritories;
    }

    public String getDateRep() {
        return dateRep;
    }

    public String getYear_week() {
        return year_week;
    }

    public String getCases_weekly() {
        return cases_weekly;
    }

    public String getDeaths_weekly() {
        return deaths_weekly;
    }

    public String getCountriesAndTerritories() {
        return countriesAndTerritories;
    }

    @Override
    public int compareTo(Data o) {
        return Integer.valueOf(Integer.parseInt(this.cases_weekly)).compareTo(Integer.parseInt(o.cases_weekly));
    }

    @Override
    public String toString() {
        return "Data{" +
                "dateRep='" + dateRep + '\'' +
                ", year_week='" + year_week + '\'' +
                ", cases_weekly='" + cases_weekly + '\'' +
                ", deaths_weekly='" + deaths_weekly + '\'' +
                ", countriesAndTerritories='" + countriesAndTerritories + '\'' +
                '}';
    }
}
