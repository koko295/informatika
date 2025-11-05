package com.sibsutis.devices;

import java.util.Objects;

public class Phone extends Device {
    public Phone(int id, int price) {
        this(id, price, null);
    }
    public Phone(int id, int price, String ip) {
        super(id, price, ip);
    }

    @Override
    protected String getDeviceType() { return "Phone"; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return getId() == phone.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
