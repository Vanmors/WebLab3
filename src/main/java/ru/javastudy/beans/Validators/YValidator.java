//package ru.javastudy.beans.Validators;
//
//import javax.faces.application.FacesMessage;
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.validator.FacesValidator;
//import javax.faces.validator.Validator;
//import javax.faces.validator.ValidatorException;
//
//@FacesValidator("yValidator")
//public class YValidator implements Validator {
//    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
//        try {
//            Float newValue = (Float) o;
//            if (o.equals("") || (o.toString()).length() > 10) {
//                if (newValue < -3 || newValue > 5) {
//                    throw new Exception();
//                }
//            }
//        } catch (Exception e) {
//            FacesMessage msg = new FacesMessage("Input validation failed");
//            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
//            throw new ValidatorException(msg);
//        }
//    }
//}
