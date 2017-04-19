/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package richtercloud.jsf.skip.entity.validation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author richter
 */
@ManagedBean
@SessionScoped
public class MyManagedBean {
    private String value;
    private String textAreaValue;
    private MyEntity myEntity = new MyEntity();

    public MyManagedBean() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTextAreaValue() {
        return textAreaValue;
    }

    public MyEntity getMyEntity() {
        return myEntity;
    }

    public void setMyEntity(MyEntity myEntity) {
        this.myEntity = myEntity;
    }

    public void setTextAreaValue(String textAreaValue) {
        this.textAreaValue = textAreaValue;
    }

    public void onSaveButtonClicked(AjaxBehaviorEvent event) {
        System.out.println("value: "+value);
        System.out.println("textAreaValue: "+textAreaValue);
        System.out.println("myEntity: "+myEntity);
    }
}
