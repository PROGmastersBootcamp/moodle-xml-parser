package com.progmasters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1 extends XmlAdapter {

    @Override
    public Object unmarshal(Object v) throws Exception {
        return (CDataAdapter.parse((String) v));
    }

    @Override
    public Object marshal(Object v) throws Exception {
        return (CDataAdapter.print((String) v));
    }

}
