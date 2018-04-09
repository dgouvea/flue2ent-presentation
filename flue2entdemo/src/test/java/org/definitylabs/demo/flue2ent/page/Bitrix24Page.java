package org.definitylabs.demo.flue2ent.page;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.table.TableElement;

public interface Bitrix24Page {

    @FindElementBy(className = "table-main")
    TableElement plans();

}
