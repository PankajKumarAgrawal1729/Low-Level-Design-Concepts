package BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.VendingStates.Impl;

import java.util.ArrayList;
import java.util.List;

import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.Coin;
import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.Item;
import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.VendingMachine;
import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.VendingStates.State;

public class IdleState implements State {
    public IdleState() {
        System.out.println("Vending Machine is in Idle State");
    }

    public IdleState(VendingMachine machine) {
        System.out.println("Vending Machine is in Idle State");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You can not choose product in Idle State");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("First You need to click on insert coin button");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product can not dispense in Idle State");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You can not get change in Idle State");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You can not insert coin in Idle State");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("You can not get refund in Idle State");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }
}
