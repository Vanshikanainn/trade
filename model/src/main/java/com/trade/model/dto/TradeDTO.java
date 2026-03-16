package com.trade.model.dto;

import com.trade.model.entity.TradeStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TradeDTO {

    private Long id;

    @NotBlank(message = "Trade ID is required")
    private String tradeId;

    @NotBlank(message = "Counterparty is required")
    private String counterparty;

    @NotBlank(message = "Instrument Type is required")
    private String instrumentType;

    @NotNull(message = "Quantity is required")
    @Positive(message = "Quantity must be positive")
    private BigDecimal quantity;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be positive")
    private BigDecimal price;

    @NotNull(message = "Notional Amount is required")
    @Positive(message = "Notional Amount must be positive")
    private BigDecimal notionalAmount;

    @NotNull(message = "Status is required")
    private TradeStatus status;

    @NotNull(message = "Trade Date is required")
    private LocalDateTime tradeDate;

    @NotNull(message = "Settlement Date is required")
    private LocalDateTime settlementDate;

    private String description;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}