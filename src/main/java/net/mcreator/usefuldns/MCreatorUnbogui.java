package net.mcreator.usefuldns;

import org.lwjgl.opengl.GL11;

import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.IContainerFactory;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;
import java.util.HashMap;

@Elementsusefuldns.ModElement.Tag
public class MCreatorUnbogui extends Elementsusefuldns.ModElement {
	public static HashMap guiinventory = new HashMap();
	public static IInventory inherited;
	private static ContainerType<GuiContainerMod> containerType = null;

	public MCreatorUnbogui(Elementsusefuldns instance) {
		super(instance, 126);
		elements.addNetworkMessage(ButtonPressedMessage.class, ButtonPressedMessage::buffer, ButtonPressedMessage::new, ButtonPressedMessage::handler);
		elements.addNetworkMessage(GUISlotChangedMessage.class, GUISlotChangedMessage::buffer, GUISlotChangedMessage::new,
				GUISlotChangedMessage::handler);
		containerType = new ContainerType<>(new GuiContainerModFactory());
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@OnlyIn(Dist.CLIENT)
	public void initElements() {
		ScreenManager.registerFactory(containerType, GuiWindow::new);
	}

	@SubscribeEvent
	public void registerContainer(RegistryEvent.Register<ContainerType<?>> event) {
		event.getRegistry().register(containerType.setRegistryName("unbogui"));
	}

	public static class GuiContainerModFactory implements IContainerFactory {
		public GuiContainerMod create(int id, PlayerInventory inv, PacketBuffer extraData) {
			return new GuiContainerMod(id, inv, extraData);
		}
	}

	public static class GuiContainerMod extends Container {
		World world;
		PlayerEntity entity;
		int x, y, z;

		public GuiContainerMod(int id, PlayerInventory inv, PacketBuffer extraData) {
			super(containerType, id);
			BlockPos pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
			IInventory inheritedinv = null;
			TileEntity ent = inv.player != null ? inv.player.world.getTileEntity(pos) : null;
			if (ent instanceof IInventory)
				inheritedinv = (IInventory) ent;
			initContainer(inv, inheritedinv);
		}

		public void initContainer(PlayerInventory inv, IInventory inheritedinv) {
			this.entity = inv.player;
			this.world = inv.player.world;
			if (inheritedinv == null)
				inherited = new Inventory(64);
			else
				inherited = inheritedinv;
			this.addSlot(new Slot(inherited, 0, 47, 83) {
			});
			this.addSlot(new Slot(inherited, 1, 65, 83) {
			});
			this.addSlot(new Slot(inherited, 2, 83, 83) {
			});
			this.addSlot(new Slot(inherited, 3, 101, 83) {
			});
			this.addSlot(new Slot(inherited, 4, 119, 83) {
			});
			this.addSlot(new Slot(inherited, 5, 137, 83) {
			});
			this.addSlot(new Slot(inherited, 6, 155, 83) {
			});
			this.addSlot(new Slot(inherited, 7, 173, 83) {
			});
			this.addSlot(new Slot(inherited, 8, 191, 83) {
			});
			this.addSlot(new Slot(inherited, 9, 47, 65) {
			});
			this.addSlot(new Slot(inherited, 10, 65, 65) {
			});
			this.addSlot(new Slot(inherited, 11, 83, 65) {
			});
			this.addSlot(new Slot(inherited, 12, 101, 65) {
			});
			this.addSlot(new Slot(inherited, 13, 119, 65) {
			});
			this.addSlot(new Slot(inherited, 14, 137, 65) {
			});
			this.addSlot(new Slot(inherited, 15, 155, 65) {
			});
			this.addSlot(new Slot(inherited, 16, 173, 65) {
			});
			this.addSlot(new Slot(inherited, 17, 191, 65) {
			});
			this.addSlot(new Slot(inherited, 18, 47, 47) {
			});
			this.addSlot(new Slot(inherited, 19, 65, 47) {
			});
			this.addSlot(new Slot(inherited, 20, 83, 47) {
			});
			this.addSlot(new Slot(inherited, 21, 101, 47) {
			});
			this.addSlot(new Slot(inherited, 22, 119, 47) {
			});
			this.addSlot(new Slot(inherited, 23, 137, 47) {
			});
			this.addSlot(new Slot(inherited, 24, 155, 47) {
			});
			this.addSlot(new Slot(inherited, 25, 173, 47) {
			});
			this.addSlot(new Slot(inherited, 26, 191, 47) {
			});
			this.addSlot(new Slot(inherited, 27, 47, 29) {
			});
			this.addSlot(new Slot(inherited, 28, 65, 29) {
			});
			this.addSlot(new Slot(inherited, 29, 83, 29) {
			});
			this.addSlot(new Slot(inherited, 30, 101, 29) {
			});
			this.addSlot(new Slot(inherited, 31, 119, 29) {
			});
			this.addSlot(new Slot(inherited, 32, 137, 29) {
			});
			this.addSlot(new Slot(inherited, 33, 155, 29) {
			});
			this.addSlot(new Slot(inherited, 34, 173, 29) {
			});
			this.addSlot(new Slot(inherited, 35, 191, 29) {
			});
			this.addSlot(new Slot(inherited, 36, 29, 83) {
			});
			this.addSlot(new Slot(inherited, 37, 11, 83) {
			});
			this.addSlot(new Slot(inherited, 40, 11, 65) {
			});
			this.addSlot(new Slot(inherited, 41, 29, 65) {
			});
			this.addSlot(new Slot(inherited, 42, 29, 47) {
			});
			this.addSlot(new Slot(inherited, 43, 11, 47) {
			});
			this.addSlot(new Slot(inherited, 45, 29, 29) {
			});
			this.addSlot(new Slot(inherited, 46, 11, 29) {
			});
			this.addSlot(new Slot(inherited, 48, 209, 83) {
			});
			this.addSlot(new Slot(inherited, 49, 227, 83) {
			});
			this.addSlot(new Slot(inherited, 51, 209, 65) {
			});
			this.addSlot(new Slot(inherited, 52, 227, 65) {
			});
			this.addSlot(new Slot(inherited, 54, 209, 47) {
			});
			this.addSlot(new Slot(inherited, 55, 227, 47) {
			});
			this.addSlot(new Slot(inherited, 57, 209, 29) {
			});
			this.addSlot(new Slot(inherited, 58, 227, 29) {
			});
			this.addSlot(new Slot(inherited, 47, 11, 101) {
			});
			this.addSlot(new Slot(inherited, 44, 11, 119) {
			});
			this.addSlot(new Slot(inherited, 39, 11, 137) {
			});
			this.addSlot(new Slot(inherited, 38, 11, 155) {
			});
			this.addSlot(new Slot(inherited, 60, 227, 101) {
			});
			this.addSlot(new Slot(inherited, 56, 227, 119) {
			});
			this.addSlot(new Slot(inherited, 53, 227, 137) {
			});
			this.addSlot(new Slot(inherited, 50, 227, 155) {
			});
			this.addSlot(new Slot(inherited, 61, 11, 11) {
			});
			this.addSlot(new Slot(inherited, 62, 29, 11) {
			});
			this.addSlot(new Slot(inherited, 63, 47, 11) {
			});
			this.addSlot(new Slot(inherited, 64, 65, 11) {
			});
			this.addSlot(new Slot(inherited, 65, 83, 11) {
			});
			this.addSlot(new Slot(inherited, 66, 101, 11) {
			});
			this.addSlot(new Slot(inherited, 67, 119, 11) {
			});
			this.addSlot(new Slot(inherited, 68, 137, 11) {
			});
			this.addSlot(new Slot(inherited, 69, 155, 11) {
			});
			this.addSlot(new Slot(inherited, 70, 173, 11) {
			});
			this.addSlot(new Slot(inherited, 71, 191, 11) {
			});
			this.addSlot(new Slot(inherited, 72, 209, 11) {
			});
			this.addSlot(new Slot(inherited, 73, 227, 11) {
			});
			int si;
			int sj;
			for (si = 0; si < 3; ++si)
				for (sj = 0; sj < 9; ++sj)
					this.addSlot(new Slot(inv, sj + (si + 1) * 9, 40 + 8 + sj * 18, 17 + 84 + si * 18));
			for (si = 0; si < 9; ++si)
				this.addSlot(new Slot(inv, si, 40 + 8 + si * 18, 17 + 142));
		}

		@Override
		public boolean canInteractWith(PlayerEntity player) {
			return true;
		}

		@Override
		public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
			ItemStack itemstack = ItemStack.EMPTY;
			Slot slot = (Slot) this.inventorySlots.get(index);
			if (slot != null && slot.getHasStack()) {
				ItemStack itemstack1 = slot.getStack();
				itemstack = itemstack1.copy();
				if (index < 73) {
					if (!this.mergeItemStack(itemstack1, 73, this.inventorySlots.size(), true)) {
						return ItemStack.EMPTY;
					}
					slot.onSlotChange(itemstack1, itemstack);
				} else if (!this.mergeItemStack(itemstack1, 0, 73, false)) {
					if (index < 73 + 27) {
						if (!this.mergeItemStack(itemstack1, 73 + 27, this.inventorySlots.size(), true)) {
							return ItemStack.EMPTY;
						}
					} else {
						if (!this.mergeItemStack(itemstack1, 73, 73 + 27, false)) {
							return ItemStack.EMPTY;
						}
					}
					return ItemStack.EMPTY;
				}
				if (itemstack1.getCount() == 0) {
					slot.putStack(ItemStack.EMPTY);
				} else {
					slot.onSlotChanged();
				}
				if (itemstack1.getCount() == itemstack.getCount()) {
					return ItemStack.EMPTY;
				}
				slot.onTake(playerIn, itemstack1);
			}
			return itemstack;
		}

		@Override
		/** 
		 * Merges provided ItemStack with the first avaliable one in the container/player inventor between minIndex (included) and maxIndex (excluded). Args : stack, minIndex, maxIndex, negativDirection. /!\ the Container implementation do not check if the item is valid for the slot
		 */
		protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
			boolean flag = false;
			int i = startIndex;
			if (reverseDirection) {
				i = endIndex - 1;
			}
			if (stack.isStackable()) {
				while (!stack.isEmpty()) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot = this.inventorySlots.get(i);
					ItemStack itemstack = slot.getStack();
					if (slot.isItemValid(itemstack) && !itemstack.isEmpty() && areItemsAndTagsEqual(stack, itemstack)) {
						int j = itemstack.getCount() + stack.getCount();
						int maxSize = Math.min(slot.getSlotStackLimit(), stack.getMaxStackSize());
						if (j <= maxSize) {
							stack.setCount(0);
							itemstack.setCount(j);
							slot.putStack(itemstack);
							flag = true;
						} else if (itemstack.getCount() < maxSize) {
							stack.shrink(maxSize - itemstack.getCount());
							itemstack.setCount(maxSize);
							slot.putStack(itemstack);
							flag = true;
						}
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			if (!stack.isEmpty()) {
				if (reverseDirection) {
					i = endIndex - 1;
				} else {
					i = startIndex;
				}
				while (true) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot1 = this.inventorySlots.get(i);
					ItemStack itemstack1 = slot1.getStack();
					if (itemstack1.isEmpty() && slot1.isItemValid(stack)) {
						if (stack.getCount() > slot1.getSlotStackLimit()) {
							slot1.putStack(stack.split(slot1.getSlotStackLimit()));
						} else {
							slot1.putStack(stack.split(stack.getCount()));
						}
						slot1.onSlotChanged();
						flag = true;
						break;
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			return flag;
		}

		@Override
		public void onContainerClosed(PlayerEntity playerIn) {
			super.onContainerClosed(playerIn);
		}

		private void slotChanged(int slotid, int ctype, int meta) {
			if (this.world != null && this.world.isRemote) {
				usefuldns.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, x, y, z, ctype, meta));
				handleSlotAction(entity, slotid, ctype, meta, x, y, z);
			}
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class GuiWindow extends ContainerScreen<GuiContainerMod> {
		World world;
		int x, y, z;
		PlayerEntity entity;

		public GuiWindow(GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
			super(container, inventory, text);
			this.world = container.world;
			this.x = container.x;
			this.y = container.y;
			this.z = container.z;
			this.entity = container.entity;
			this.xSize = 255;
			this.ySize = 200;
		}
		private static final ResourceLocation texture = new ResourceLocation("usefuldns:textures/unbogui.png");

		@Override
		public void render(int mouseX, int mouseY, float partialTicks) {
			this.renderBackground();
			super.render(mouseX, mouseY, partialTicks);
			this.renderHoveredToolTip(mouseX, mouseY);
		}

		@Override
		protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			Minecraft.getInstance().getTextureManager().bindTexture(texture);
			int k = (this.width - this.xSize) / 2;
			int l = (this.height - this.ySize) / 2;
			this.blit(k, l, 0, 0, this.xSize, this.ySize);
		}

		@Override
		public void tick() {
			super.tick();
		}

		@Override
		protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
			this.font.drawString("Unobtainium Chest", 91, 180, -16738048);
		}

		@Override
		public void removed() {
			super.removed();
			Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
		}

		@Override
		public void init(Minecraft minecraft, int width, int height) {
			super.init(minecraft, width, height);
			minecraft.keyboardListener.enableRepeatEvents(true);
		}
	}

	public static class ButtonPressedMessage {
		int buttonID, x, y, z;

		public ButtonPressedMessage(PacketBuffer buffer) {
			this.buttonID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
		}

		public ButtonPressedMessage(int buttonID, int x, int y, int z) {
			this.buttonID = buttonID;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public static void buffer(ButtonPressedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.buttonID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
		}

		public static void handler(ButtonPressedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}

	public static class GUISlotChangedMessage {
		int slotID, x, y, z, changeType, meta;

		public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
			this.slotID = slotID;
			this.x = x;
			this.y = y;
			this.z = z;
			this.changeType = changeType;
			this.meta = meta;
		}

		public GUISlotChangedMessage(PacketBuffer buffer) {
			this.slotID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
			this.changeType = buffer.readInt();
			this.meta = buffer.readInt();
		}

		public static void buffer(GUISlotChangedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.slotID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
			buffer.writeInt(message.changeType);
			buffer.writeInt(message.meta);
		}

		public static void handler(GUISlotChangedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}

	private static void handleButtonAction(PlayerEntity entity, int buttonID, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}

	private static void handleSlotAction(PlayerEntity entity, int slotID, int changeType, int meta, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}
}
