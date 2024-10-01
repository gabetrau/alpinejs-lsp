package com.fuse;

import java.nio.charset.Charset;

import com.fasterxml.jackson.core.JsonParser;
import com.oracle.svm.core.annotate.Inject;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.serde.ObjectMapper;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "alpinejs-lsp", description = "...",
        mixinStandardHelpOptions = true)
public class AlpinejsLspCommand implements Runnable {
    
    @Inject
    ObjectMapper mapper;

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    private final Charset UTF8_CHARSET = Charset.forName("UTF-8");

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(AlpinejsLspCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }

    public String encodeMessage(LspMessage msg) {
        return
    }
}
