package com.company.initiator_and_applications_origin.screen.departament;

import io.jmix.ui.screen.*;
import com.company.initiator_and_applications_origin.entity.Departament;

@UiController("Departament.browse")
@UiDescriptor("departament-browse.xml")
@LookupComponent("departamentsTable")
public class DepartamentBrowse extends StandardLookup<Departament> {
}