// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class TileEntitySign extends TileEntity
{

    public TileEntitySign()
    {
        lineBeingEdited = -1;
    }

    public void func_481_b(NBTTagCompound nbttagcompound)
    {
        super.func_481_b(nbttagcompound);
        nbttagcompound.func_754_a("Text1", signText[0]);
        nbttagcompound.func_754_a("Text2", signText[1]);
        nbttagcompound.func_754_a("Text3", signText[2]);
        nbttagcompound.func_754_a("Text4", signText[3]);
    }

    public void func_482_a(NBTTagCompound nbttagcompound)
    {
        super.func_482_a(nbttagcompound);
        for(int i = 0; i < 4; i++)
        {
            signText[i] = nbttagcompound.func_755_i((new StringBuilder()).append("Text").append(i + 1).toString());
            if(signText[i].length() > 15)
            {
                signText[i] = signText[i].substring(0, 15);
            }
        }

    }

    public String signText[] = {
        "", "", "", ""
    };
    public int lineBeingEdited;
}
