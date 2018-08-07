package com.hang.bean;

import java.util.Date;

public class Tb_Item_Desc {
    private Long itemId;

    private Date created;

    private Date updated;

    private String itemDesc;

    public Tb_Item_Desc(Long itemId, Date created, Date updated, String itemDesc) {
        this.itemId = itemId;
        this.created = created;
        this.updated = updated;
        this.itemDesc = itemDesc;
    }

    public Tb_Item_Desc() {
        super();
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }
}