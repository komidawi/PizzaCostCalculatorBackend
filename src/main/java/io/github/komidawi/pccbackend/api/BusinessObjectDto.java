package io.github.komidawi.pccbackend.api;

class BusinessObjectDto {

    private int id;

    public BusinessObjectDto() {
    }

    public BusinessObjectDto(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
