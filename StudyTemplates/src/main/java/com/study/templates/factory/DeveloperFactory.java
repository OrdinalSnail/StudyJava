package com.study.templates.factory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author d_mokharev
 */
public class DeveloperFactory {

    public static IDeveloper createDynamicDeveloper(DeveloperType type) {
        for (DeveloperType val : DeveloperType.values()) {
            if (val.equals(type)) {
                try {
                    return (IDeveloper) val.getValue().newInstance();
                } catch (InstantiationException ex) {
                    Logger.getLogger(DeveloperFactory.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(DeveloperFactory.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
        return null;

    }

    public static IDeveloper createDeveloperBySupplier(DeveloperType type) {
        for (DeveloperType val : DeveloperType.values()) {
            if (val.equals(type)) {
                return val.getInst().get();
            }
        }
        return null;
    }

}
