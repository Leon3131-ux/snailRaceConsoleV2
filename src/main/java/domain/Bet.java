package domain;

import lombok.Data;

@Data
public class Bet {

    private int rank;

    private long betAmount;

    private Snail snail;

    private Gambler gambler;

}
