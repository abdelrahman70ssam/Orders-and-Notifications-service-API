package com.fci.advanced.ordersnotificationsservice.StoreModule;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreBSL {

    private Store store;

    @Autowired
    public StoreBSL(Store store) {
        this.store = store ;
        store.initStore();
    }


    public Store getStore() {
        return store;
    }
}
