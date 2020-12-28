package com.farzoom.lime.adapter.cbs.utils.ref.impl;

import com.farzoom.lime.adapter.cbs.utils.ref.RefItemL;

import java.util.List;

public interface RefServiceL {
    List<RefItemL> getItems(String refName);
}
