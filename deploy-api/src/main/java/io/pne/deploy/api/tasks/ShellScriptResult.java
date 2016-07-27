package io.pne.deploy.api.tasks;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.pne.deploy.api.IClientMessage;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize  (as = ImmutableShellScriptResult.class)
@JsonDeserialize(as = ImmutableShellScriptResult.class)
public interface ShellScriptResult extends IClientMessage {

    int exitCode();

    Optional<String> errorMessage();

}
