package com.iCo.system.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AccountReset extends Event {
    private final String account;
    private boolean cancelled = false;

    public AccountReset(String account) {
        this.account = account;
    }

    public String getAccountName() {
        return account;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    private static final HandlerList handlers = new HandlerList();

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

