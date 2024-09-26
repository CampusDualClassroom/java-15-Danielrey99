package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, Date expirationDate) {
        super(name, uniqueId, responsibleId);
        this.expirationDate = expirationDate;
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public Object getSpecificData() {
        String date = getFormattedDate(this.expirationDate);

        StringBuilder sb = new StringBuilder();
        sb.append("Localizacion: ").append(getLocation()).append(", ");
        sb.append("Expiracion: ").append(date);

        return sb.toString();
    }

    public String getFormattedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void printSpecificData(){
        System.out.println(getSpecificData());
    }
}
