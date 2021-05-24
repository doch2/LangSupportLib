package com.dochsoft.langsupportlib.command;

import com.dochsoft.langsupportlib.Reference;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class AddItemLocalNameCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = ((Player) sender).getPlayer();

        if (!(sender instanceof Player)) {
            sender.sendMessage(Reference.prefix_error + Reference.COMMAND_CMD_NOT_PRACTICE_MESSAGE);
            return true;
        }

        if (player.isOp()) {
            if (args.length > 1) {
                ItemStack itemStack = player.getItemInHand();

                if (itemStack == null || itemStack.getType() == Material.AIR) {
                    player.sendMessage(Reference.prefix_error + "등록할 아이템을 손에 든 후 다시 시도해주세요.");
                } else {

                }
            } else {
                player.sendMessage(Reference.prefix_error + Reference.COMMAND_NOT_CORRECT);
                player.sendMessage("§6/addItemLocalName <추가할 아이템 이름> §7- 번역할 아이템을 손에 들고 커맨드를 입력할 시, 새로이 아이템의 번역된 이름이 추가됩니다.");
            }
        } else { player.sendMessage(Reference.prefix_error + Reference.COMMAND_NOTALLOW_NOOP_MESSAGE); }

        return false;
    }
}
