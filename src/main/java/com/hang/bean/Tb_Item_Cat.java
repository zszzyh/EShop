package com.hang.bean;

import java.util.Date;

public class Tb_Item_Cat {
    private Long id;

    @Override
    public String toString() {
        return "Tb_Item_Cat{" +
                "id=" + id +
                ", parent_id=" + parent_id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", sort_order=" + sort_order +
                ", is_parent=" + is_parent +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }

    private Long parent_id;

    private String name;

    private Integer status;

    private Integer sort_order;

    private Boolean is_parent;

    private Date created;

    private Date updated;

    public Tb_Item_Cat(Long id, Long parent_id, String name, Integer status, Integer sort_order, Boolean is_parent, Date created, Date updated) {
        this.id = id;
        this.parent_id = parent_id;
        this.name = name;
        this.status = status;
        this.sort_order = sort_order;
        this.is_parent = is_parent;
        this.created = created;
        this.updated = updated;
    }

    public Tb_Item_Cat() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort_order() {
        return sort_order;
    }

    public void setSort_order(Integer sort_order) {
        this.sort_order = sort_order;
    }

    public Boolean getIs_parent() {
        return is_parent;
    }

    public void setIs_parent(Boolean is_parent) {
        this.is_parent = is_parent;
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
}