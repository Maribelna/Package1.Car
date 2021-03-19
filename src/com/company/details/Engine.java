package com.company.details;

public class Engine {
    private long power;
    private String company;

    public long getPower() {
        return power;
    }

    public void setPower(long power) {
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}
