package edu.eci.arsw.myrestaurant.DTO;

import edu.eci.arsw.myrestaurant.model.Order;
import org.springframework.http.ResponseEntity;

public class TotalResponse {
    Order order;

    int total;

    public TotalResponse(Order order, int total){
        this.order = order;
        this.total = total;
    }


    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
