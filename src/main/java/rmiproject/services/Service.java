package rmiproject.services;

import javax.swing.*;
import java.io.Serializable;

public interface Service extends Serializable {
    JPanel getGuiPanel();
}
