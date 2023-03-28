package com.ryodan.utilitybills.pojo;

import java.io.ByteArrayOutputStream;
import java.util.Date;

public class Bill { //квитанция
    private Long id;
    //@OneToMany
    private BillFile file;
    private Date created;
}
