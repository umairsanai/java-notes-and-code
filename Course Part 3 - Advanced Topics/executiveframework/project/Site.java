package executiveframework.project;

public class Site {
    private String siteName;
    private int price;
    private int responseTime;

    public Site(String siteName) {
        this.siteName = siteName;
        this.price = ((int) Math.round(Math.random() * 100)) + 100;
        this.responseTime = ((int) Math.round(Math.random() * 2000)) + 1000;
    }
    
    public String quotePrice() {
        System.out.println("Getting a quote from " + siteName);
        Utils.waitFor(this.responseTime);
        return "Quote{site='" + siteName + "', price=" + price + "}";
    }
    public int getResponseTime() {
        return this.responseTime;
    }
}
