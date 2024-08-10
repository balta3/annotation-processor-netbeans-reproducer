package let.me.reproduce.annotation.processor.netbeans.reproducer;

import io.soabase.recordbuilder.core.RecordBuilder;

@RecordBuilder
public record Person(String name, String age) {}
