//
//  GameScene.swift
//  Tamagucci
//
//  Created by Amber Owens on 2/5/20.
//  Copyright © 2020 Amber Owens. All rights reserved.
//

import SpriteKit
import GameplayKit

class GameScene: SKScene {
    var MainGuy = SKSpriteNode()
    
    var TextureAtlas = SKTextureAtlas()
    var TextureArray = [SKTexture]()
    override func didMoveToView(view: SKView) {
        
        TextureAtlas = SKTextureAtlas(named: "Images")
        for i in 0...TextureAtlas.textureNames.count{
            var Name = "awake().png"
            TextureArray.append(SKTexture(imageNamed: Name))
        }
        MainGuy = SKSpriteNode(imageNamed: TextureAtlas.textureNames[0] as! String)
        MainGuy.size=CGSize(width: 70, height: 140)
        MainGuy.position = CGPoint(x: self.size.width / 2, y: self.size.height / 2)
        self.addChild(MainGuy)
    
    }
    override func touchesBegan(_ touches: Set<UITouch>, with event: UIEvent?) {
        MainGuy.runAction(SKAction.repeatActionForever(SKAction.animateWithTextures(TextureArray, timePerFrame: 0.1)))
    }
   
}
