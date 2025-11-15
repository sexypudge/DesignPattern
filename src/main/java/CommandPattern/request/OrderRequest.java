package CommandPattern.request;

import lombok.Data;

@Data
public class OrderRequest implements IRequest {
    private String orderId;
}
