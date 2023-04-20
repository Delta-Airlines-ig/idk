package idk.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
//import mindustry.annotations.Annotations.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;


public class EarthUnitTypes{

//L = light, M = medium, H = heavy, C = chasis, W = weapon, A = armoured, ex: MCLWA = medium chasis, light weapon, armoured
//LW = normal cannon, MW = laser cannon, HW = guided missile launcher
//LCLW = machine gun, MCMW = better cannon, HCHW = dual missiles
//ground
    public static UnitType dagge, LCLW, LCLWA, MCLW, MCLWA, HCLW, HCLWA, LCMW, LCMWA, MCMW, MCMWA, HCMW, HCMWA, LCHW, LCHWA, MCHW, MCHWA, HCHW, HCHWA;

public static void load() {
  
	dagge = new UnitType("dagge"){{
            speed = 0.5f;
            hitSize = 8f;
            health = 150;
            weapons.add(new Weapon("large-weapon"){{
                reload = 13f;
                x = 4f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(2.5f, 9){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	LCLW = new UnitType("LCLW"){{
            speed = 1f;
            hitSize = 8f;
            health = 250;
	    armor = 3;
            weapons.add(new Weapon("machine-gun"){{
                reload = 2f;
                x = 4f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(5f, 5){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	LCLWA = new UnitType("LCLWA"){{
            speed = 0.95f;
            hitSize = 8f;
            health = 250;
	    armor = 6;
            weapons.add(new Weapon("machine-gun"){{
                reload = 2f;
                x = 4f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(5f, 5){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	MCLW = new UnitType("MCLW"){{
            speed = 0.8f;
            hitSize = 8f;
            health = 600;
	    armor = 3;
            weapons.add(new Weapon("cannon"){{
                reload = 60f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(7f, 25){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	MCLWA = new UnitType("MCLWA"){{
            speed = 0.75f;
            hitSize = 8f;
            health = 600;
	    armor = 6;
            weapons.add(new Weapon("cannon"){{
                reload = 60f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(7f, 25){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	HCLW = new UnitType("HCLW"){{
            speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 3;
            weapons.add(new Weapon("cannon"){{
                reload = 60f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(7f, 25){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};

	//done
	HCLWA = new UnitType("HCLWA"){{
            speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 6;
            weapons.add(new Weapon("cannon"){{
                reload = 60f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(7f, 25){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	LCMW = new UnitType("LCMW"){{
            speed = 1f;
            hitSize = 8f;
            health = 250;
	    armor = 3;
            weapons.add(new Weapon("laser-cannon"){{
                reload = 40f;
                x = 4f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(5f, 50){{
                    width = 14f;
                    height = 18f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	LCMWA = new UnitType("LCMWA"){{
            speed = 0.95f;
            hitSize = 8f;
            health = 250;
	    armor = 6;
            weapons.add(new Weapon("laser-cannon"){{
                reload = 40f;
                x = 4f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(5f, 50){{
                    width = 14f;
                    height = 18f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	MCMW = new UnitType("MCMW"){{
            speed = 0.8f;
            hitSize = 8f;
            health = 600;
	    armor = 3;
            weapons.add(new Weapon("fast-laser-cannon"){{
                reload = 25f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(5f, 45){{
                    width = 14f;
                    height = 18f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	MCMW = new UnitType("MCMW"){{
            speed = 0.75f;
            hitSize = 8f;
            health = 600;
	    armor = 6;
            weapons.add(new Weapon("fast-laser-cannon"){{
                reload = 25f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(5f, 45){{
                    width = 14f;
                    height = 18f;
                    lifetime = 60f;
                }};
            }});
        }};
  
  
}
}
