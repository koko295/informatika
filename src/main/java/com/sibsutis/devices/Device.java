package com.sibsutis.devices;

import com.sibsutis.Printable;

/** Базовый класс устройства по диаграмме. */
public abstract class Device implements Printable {
    private final int id;      // уникальный идентификатор
    private final int price;   // стоимость
    private final String ip;   // ip адрес (может быть null)

    public Device(int id, int price, String ip) {
        this.id = id;
        this.price = price;
        this.ip = ip;
    }

    public int getId()    { return id; }
    public int getPrice() { return price; }
    public String getIp() { return ip; }

    /** Тип устройства: "PersonalComputer" или "Phone". */
    protected abstract String getDeviceType();

    /** Реализация Printable. */
    @Override
    public String print() {
        return String.format("%s{id=%d, price=%d, ip=%s}",
                getDeviceType(), id, price, ip);
    }
}
