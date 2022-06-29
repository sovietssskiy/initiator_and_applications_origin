package com.company.initiator_and_applications_origin.screen.departament;

import io.jmix.ui.screen.*;
import com.company.initiator_and_applications_origin.entity.Departament;

@UiController("Departament.edit")
@UiDescriptor("departament-edit.xml")
@EditedEntityContainer("departamentDc")
public class DepartamentEdit extends StandardEditor<Departament> {
}