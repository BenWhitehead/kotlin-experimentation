package com.github.benwhitehead.kotlin.fromjava

import java.util.Properties
import java.util.TreeMap

/**
* @author Ben Whitehead
*/
public open class PrintSystemProperties() {
    class object {
        public open fun main(args: Array<String>): Unit {
            val properties: Properties = System.getProperties()!!
            val props: MutableMap<String, String> = TreeMap()
            for (entry in properties.entrySet()!!.iterator()) {
                var key: String = ""
                var value: String = ""
                if (entry?.getKey() is String?) {
                    key = (entry?.getKey() as String)
                }
                if (entry?.getValue() is String?) {
                    value = (entry?.getValue() as String)
                }
                props.put(key, value)
            }
            for (entry : Map.Entry<String, String> in props.entrySet()) {
                System.out.println(entry.getKey() + " => " + entry.getValue())
            }
        }
    }
}
fun main(args: Array<String>) = PrintSystemProperties.main(args)
