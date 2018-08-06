package com.hang.bean.bean;

import java.util.Date;

public class tb_item_desc {
    private Long itemId;

    private Date created;

    private Date updated;

    private String itemDesc;

    public tb_item_desc(Long itemId, Date created, Date updated, String itemDesc) {
        this.itemId = itemId;
        this.created = created;
        this.updated = updated;
        this.itemDesc = itemDesc;
    }

    public tb_item_desc() {
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