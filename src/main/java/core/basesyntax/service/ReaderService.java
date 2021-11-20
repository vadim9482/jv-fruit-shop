package core.basesyntax.service;

import core.basesyntax.model.Activity;

import java.io.File;
import java.util.List;

public interface ReaderService {
    List<Activity> read(File file);
}