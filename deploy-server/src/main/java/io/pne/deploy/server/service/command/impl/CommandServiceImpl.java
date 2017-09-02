package io.pne.deploy.server.service.command.impl;

import io.pne.deploy.server.dao.ICommandsDao;
import io.pne.deploy.server.model.Command;
import io.pne.deploy.server.service.command.ICommandService;

public class CommandServiceImpl implements ICommandService {

    private final ICommandsDao commandsDao;

    public CommandServiceImpl(ICommandsDao commandsDao) {
        this.commandsDao = commandsDao;
    }

    @Override
    public void scheduleCommand(Command aCommand) {
        if(aCommand.commandName.equals("@script")) {
            tryToSendScriptCommand(aCommand);
        } else {
            // todo unknown command
        }
    }

    private void tryToSendScriptCommand(Command aCommand) {

    }
}